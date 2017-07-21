package factory;

import product.Clothes;

/**
 * Created by zl on 2017/7/21.
 */

public class ClothesALLFactory extends ClothesFactory_reflect {

    @Override
    public <T extends Clothes> T createClothes(Class<T> clz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Clothes clothes = (Clothes) Class.forName(clz.getName()).newInstance();
        return (T) clothes;
    }
}
