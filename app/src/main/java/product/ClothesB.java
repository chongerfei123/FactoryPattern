package product;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zl on 2017/7/21.
 */

public class ClothesB extends Clothes {
    @Override
    public void method(Context context) {
        Toast.makeText(context,"我是B衣服",Toast.LENGTH_LONG).show();
    }
}