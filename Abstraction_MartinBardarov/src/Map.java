public class Map {

    private int gridSize;

   private final char pointSymbol = '•';

    public Map(int gridSize) {
        this.gridSize = gridSize;
    }

    public int getGridSize() {
        return gridSize;
    }

    public void setGridSize(int gridSize) {
        this.gridSize = gridSize;
    }

    public char getPointSymbol() {
        return pointSymbol;
    }
}
