package others;

import java.util.*;

public class book {
    public static void main(String[] args) {
        //创建对象
        Books books1 = new Books(1111, "Java", 48.0, "Sun出版社");
        Books books2 = new Books(1112, "Python", 25.7, "Python出版社");
        Books books3 = new Books(1113, "汉语言", 15.3, "C++出版社");
        HashMap<Integer, Books> booksHashMap = new HashMap<>();
        booksHashMap.put(books1.getNum(), books1);
        booksHashMap.put(books2.getNum(), books2);
        booksHashMap.put(books3.getNum(), books3);
        List<HashMap<Integer, Books>> booklist = new ArrayList<>();
        booklist.add(booksHashMap);
        System.out.println("编号\t名称\t单价\t出版社");
        for (HashMap<Integer, Books> h : booklist) {
            Set<Integer> key = h.keySet();
            for (Integer i : key) {
                System.out.println(i + "\t" + h.get(i).getName()
                        + "\t" + h.get(i).getPrice()
                        + "\t" + h.get(i).getPress());
            }
        }

    }
}

class Books {
    private int num;
    private String name;
    private double price;
    private String press;

    public Books(int num, String name, double price, String press) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    int getNum() {
        return this.num;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    String getPress() {
        return this.press;
    }
}