package tile;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class TileManager {
    GamePanel gp;
    Tile[] tile;
    public TileManager(GamePanel gp){
        this.gp = gp;
        tile = new Tile[10];
        getTileImage();
    }
    public void getTileImage(){
         try{
            tile[0] = new Tile();
            File f8 = new File("./src/player/boy_right_2.png");
            tile[0].image = ImageIO
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
