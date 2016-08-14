/**
 * Created by tkondo on 2016/08/14.
 */

/*  クラス定義 */
package ClassDefinition

class Additional(val firstVal:Int, val secondVal:Int)

fun main(args: Array<String>){
    val obj = Additional(5, 20);
    val first = obj.firstVal;
    val second = obj.secondVal;

    println("第一引数:" + first);
    println("第二引数:" + second);
}