package UI;

//ImageTile takes an image separated in grids, loops through each grid and return an image series to create an animation
public class ImageTile extends Image {
    private int tileWidth;
    private int tileHeight;

    public ImageTile(String path, int tileWidth, int tileHeight) {
        super(path);
        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;
    }

    //will take an animation (image tile) and convert it into an image
    public Image getTileImage(int tileX, int tileY) {
        int[] pixels = new int[tileWidth * tileHeight];

        for(int y = 0; y < tileHeight; y++) {
            for(int x = 0; x < tileWidth; x++) {
                pixels[x + y * tileWidth] = this.getPixels()[(x + tileX * tileWidth) + (y + tileY * tileHeight) * this.getWidth()];
            }
        }
        return new Image(pixels, tileWidth, tileHeight);
    }

    public int getTileWidth() {
        return tileWidth;
    }

    public void setTileWidth(int tileWidth) {
        this.tileWidth = tileWidth;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public void setTileHeight(int tileHeight) {
        this.tileHeight = tileHeight;
    }
}
