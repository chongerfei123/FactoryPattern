package factory;

import product.Clothes;
import product.ClothesA;

/**
 * Created by zl on 2017/7/21.
 */

public class ClothesAFactory extends ClothesFactory {

    @Override
    public Clothes createClothes() {
        ClothesA clothesA = new ClothesA();
        return clothesA;
    }
}
