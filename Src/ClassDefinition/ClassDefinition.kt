/**
 * Created by tkondo on 2016/08/14.
 */

/*  クラス定義 */
package ClassDefinition

/* クラスのコンストラクタにvalを付けて宣言することで、
 * プロパティの宣言として扱うことができる。
 * */
class Dividable(val firstVal:Int, val secondVal:Int){

    /*
        require関数を使用することで、
        変数の値チェックをおこなうことができる。
        条件に合わなかった場合は、IllegalArgumentExceptionが発生する。

        今回は、単なる値チェックにとどめたが、有理数チェックやnullチェックの可能
     */
    init {
        require(firstVal != 0, {"firstval need except Zero"})
    }

    /* 変数を${}で囲った場合、その評価値を取得できる。
    *  下記の2行のoverrrideメソッドは同じ結果を返す。
    */
    // override fun toString(): String = (firstVal / secondVal).toString();
    override fun toString(): String = "${(firstVal / secondVal)}";
}


/* こっちは普通の引数ありコンストラクタ */
class DividableNonProperties(firstVal:Int, secondVal:Int)

fun main(args: Array<String>){
    val obj = Dividable(5, 20);
    val first = obj.firstVal;
    val second = obj.secondVal;

    println("第一引数:" + first);
    println("第二引数:" + second);
    println("ToString override:" + obj);

    // 以下の場合は例外発生
    val obj2 = Dividable(0, 10);
    val first2 = obj2.firstVal;
    val second2 = obj2.secondVal;

    println("第一引数:" + first2);
    println("第二引数:" + second2);
    println("ToString override:" + obj2);
}