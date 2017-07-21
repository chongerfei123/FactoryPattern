package factory;

import product.Clothes;

/**
 * Created by zl on 2017/7/21.
 */

//工厂的抽象类
public abstract class ClothesFactory {
    public abstract Clothes createClothes();
}
