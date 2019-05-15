package garden_planner.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GardenPlanner {
    public static final String GARDEN_PLANNER_VERSION = "Garden Planner v0.2";
    public static final double SOIL_DEPTH = 0.2; 

    private double soilPrice;
    private double wallPrice;

    private final ArrayList<GardenBed> beds = new ArrayList<>();
    private double totalWallLength;
    private double totalGardenArea;

    public GardenPlanner(double soilPerCubicMetre, double wallPerMetre) {
        this.soilPrice = soilPerCubicMetre;
        this.wallPrice = wallPerMetre;
    }

    public GardenPlanner() {
        this(81.0, 51.00 / 3.0);
    }

    public void createBasicDesign() {
        beds.clear();
        RectBed r1 = new RectBed("Rectangle");
        RectBed r2 = new RectBed("Rectangle");
        RectBed r3 = new RectBed("Rectangle");
        CircleBed c1 = new CircleBed("Circle");
        CircleBed c2 = new CircleBed("Circle");

        r1.setWidth(1.0);
        r2.setWidth(1.0);
        c1.setDiameter(2.0);
        c2.setDiameter(3.0);

        r1.setHeight(2.0);
        r2.setHeight(2.0);


        r1.setLeft(1.0);
        r2.setLeft(5.0);
        c1.setLeft(4.0);
        c2.setLeft(1.5);

        r1.setTop(0.7);
        r2.setTop(0.7);
        c1.setTop(1.7);
        c2.setTop(3.5);

        beds.add(r1);
        beds.add(r2);
        beds.add(c1);
        beds.add(c2);
    }

    public List<GardenBed> getBeds() {
        return this.beds;
    }

    public double getTotalWallLength() {
        return totalWallLength;
    }

    public double getTotalGardenArea() {
        return totalGardenArea;
    }

    public double getSoilPrice() {
        return soilPrice;
    }

    public void setSoilPrice(double soilPrice) {
        this.soilPrice = soilPrice;
    }

    public double getWallPrice() {
        return wallPrice;
    }

    public void setWallPrice(double wallPrice) {
        this.wallPrice = wallPrice;
    }

     public void readBeds(Scanner in) {
        while (in.hasNext()) {
            String line = in.nextLine().trim();
            String[] words = line.split(" +");
           System.out.println(Arrays.toString(words));
            if (line.startsWith("#") || line.length() == 0) {
               } else if (words.length == 5 && words[0].toLowerCase().equals("rectangle")) {
                RectBed rect = new RectBed("Rectangle");
                rect.setLeft(Double.parseDouble(words[1]));
                rect.setTop(Double.parseDouble(words[2]));
                rect.setWidth(Double.parseDouble(words[3]));
                rect.setHeight(Double.parseDouble(words[4]));
                getBeds().add(rect);
            }
            else  if (words.length == 4 && words[0].toLowerCase().equals("Circle")) {
                CircleBed Cir = new CircleBed(Double.parseDouble(words[3]));
                Cir.setLeft(Double.parseDouble(words[1]));
                Cir.setTop(Double.parseDouble(words[2]));
                Cir.setDiameter(Double.parseDouble(words[3]));
                getBeds().add(Cir);}
            else {
                throw new IllegalArgumentException("ERROR: illegal garden bed: " + line);
            }
        }
    }

    public void recalculateTotals() {
        totalWallLength = 0.0;
        totalGardenArea = 0.0;
        for (GardenBed bed : this.beds) {
            totalGardenArea += bed.getArea();
            totalWallLength += bed.getPerimeter();
        }
    }

     public double getTotalCost() {
        final double wallCost = totalWallLength * this.wallPrice;
        final double soilVolume = totalGardenArea * this.SOIL_DEPTH;
        final double soilCost = soilVolume * this.soilPrice;
        System.out.printf("Total wall length is %.2f m, cost $%.2f.\n", totalWallLength, wallCost);
        System.out.printf("Total garden area is %.2f m2 (%.2f m3 of soil), cost $%.2f.\n", totalGardenArea, soilVolume, soilCost);
        System.out.printf("Total cost is: $%.2f\n", (wallCost + soilCost));
        return wallCost + soilCost;
    }
}

