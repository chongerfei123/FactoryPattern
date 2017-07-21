package factory;

import product.Clothes;

/**
 * Created by zl on 2017/7/21.
 */

//工厂的抽象类
public abstract class ClothesFactory_reflect {
    //通过反射传进来一个T.class，返回一个T，
    //T是Clothes的子类
    public abstract <T extends Clothes>T createClothes(Class<T> clz) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
