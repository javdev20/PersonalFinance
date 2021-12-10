package settings;

import java.util.HashMap;

final public class Text {

    private static final HashMap<String, String> data = new HashMap();

    public static String get(String key) {
        if (data.containsKey(key)) return data.get(key);
        System.out.println("Такого ключа в Text не существует!"); // Для отладки
        return "";
    }

    public static void init() {
        data.put("PROGRAMM_NAME", "Домашняя бухгалтерия");

        data.put("MENU_FILE", "Файл");
        data.put("MENU_EDIT", "Правка");
        data.put("MENU_VIEW", "Вид");
        data.put("MENU_SETTINGS", "Настройки");
        data.put("MENU_HELP", "Помощь");

        data.put("MENU_FILE_NEW", "Новый");
        data.put("MENU_FILE_OPEN", "Открыть");
        data.put("MENU_FILE_SAVE", "Сохранить");
        data.put("MENU_FILE_UPDATE_CURRENCIES", "Обновить курс валют");
        data.put("MENU_FILE_EXIT", "Выход");
    }
}
