/**
 * @author Chris
 * @create 2021-06-26-20:17
 */
/** offer05 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * */

// 方法1 时间复杂度：O(n)；空间复杂度：O(n)
class Solution0501 {
    public String replaceSpace(String s) {
        int len = s.length();
        int a = 0;
        char[] arr = new char[len*3];
        for(int i = 0; i<len;i++){
            char c = s.charAt(i);
            if(c == ' '){
                arr[a++] = '%';
                arr[a++] = '2';
                arr[a++] = '0';
            }else{
                arr[a++] = c;
            }
        }
        String str = new String(arr,0,a);
        return str;
    }
}

// 方法2 时间复杂度：O(n)；空间复杂度：O(n)
// string 本身是不可改变的，它只能赋值一次，每一次内容发生改变，都会生成一个新的对象，然后原有的对象引用新的对象，而每一次生成新对象
// 都会对系统性能产生影响，这会降低.NET编译器的工作效率
// StringBuilder 类则不同，每次操作都是对自身对象进行操作，而不是生成新的对象，其所占空间会随着内容的增加而扩充，这样，在做大量的修改
// 操作时，不会因生成大量匿名对象而影响系统性能。
class Solution0502 {
    public String replaceSpace(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        StringBuilder newStr = new StringBuilder();
        int len = s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(c == ' '){
                newStr.append("%20");
            }else{
                newStr.append(c);
            }
        }
        return newStr.toString();
    }
}