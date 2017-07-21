package factory;

import product.Clothes;
import product.ClothesB;

/**
 * Created by zl on 2017/7/21.
 */

public class ClothesBFactory extends ClothesFactory {

    @Override
    public Clothes createClothes() {
        ClothesB clothesB = new ClothesB();
        return clothesB;
    }
}
