import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //1. Объявить и инициализировать словарь hashMap<String, String>
        HashMap<String, String> dictionary = new HashMap<String, String>();
        System.out.println("Задание #1 - объявлен и инициализирован dictionary");

        //2. Добавить в словарь 10 пар "Ключ - Значение". Автор и название книги например.
        dictionary.put("Джордж Мартин ", " Игра престолов");
        dictionary.put("Анджей Сапковский ", " Ведьмак");
        dictionary.put("Эрих Мария Ремарк ", " Три товарища");
        dictionary.put("Эрнест Хемингуэй ", " По ком звонит колокол");
        dictionary.put("Антуан де Сент-Экзюпери ", " Маленький принц");
        dictionary.put("Хизер Моррис ", " Татуировщик из Освенцима");
        dictionary.put("Джоан Роулинг ", " Гарри Поттер");
        dictionary.put("Федор Достоевский ", " Идиот");
        dictionary.put("Джон Рональд Руэл Толкин ", " Властелин колец");
        dictionary.put("Стивен Кинг ", " Зеленая миля");
        System.out.println("Задание #2: " + dictionary);

        //3. Пройти по словарю и добавить к значениям символ "!"
        for (String str: dictionary.values()) {
            System.out.println("Задание #3: " + str + "!");
        }

        //4. Добавить нового автора и название книги если соответствующего ключа не было.
        dictionary.putIfAbsent("Михаил Булгаков ", " Мастер и Маргарита");
        System.out.println("Задание #4: " + dictionary);

        //5. Если ключ, указанный в запросе, имеется, вырезать из соответствующего ключу значения первое слово.
        if (dictionary.containsKey("Джордж Мартин ")){            
            dictionary.replace("Джордж Мартин ", " престолов");
            System.out.println("Задание #5: " + dictionary);       
        }
        
        //6. *Пройти по словарю другим, не таким как в пункте 3, методом и вывести пары ключ значение в консоль.
        Iterator<String> keySetIterator = dictionary.keySet().iterator();
        while (keySetIterator.hasNext()) {
            String key = (String) keySetIterator.next();
            System.out.println("Задание #6: " + key + "-" +  dictionary.get(key));
        }

        //7. ** Пройти по словарю другим, не таким как в пункте 3 и 6, методом. Добавить к значениям строку "(просмотрен)" и вывести в консоль.
        dictionary.forEach((k,v) -> {System.out.println("Задание #7: "+ k + " = " + v + " - просмотрен");});
    }
    
}