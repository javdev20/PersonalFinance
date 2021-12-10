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

        data.put("MENU_EDIT_ADD", "Добавить");
        data.put("MENU_EDIT_EDIT", "Изменить");
        data.put("MENU_EDIT_DELETE", "Удалить");

        data.put("MENU_VIEW_OVERVIEW", "Обзор");
        data.put("MENU_VIEW_ACCOUNTS", "Счета");
        data.put("MENU_VIEW_ARTICLES", "Статьи");
        data.put("MENU_VIEW_TRANSACTIONS", "Транзакции");
        data.put("MENU_VIEW_TRANSFERS", "Переводы");
        data.put("MENU_VIEW_CURRENCIES", "Валюты");
        data.put("MENU_VIEW_STATISTICS", "Статистика");

        data.put("MENU_SETTINGS_LANGUAGE", "Язык");
        data.put("MENU_SETTINGS_LANGUAGE_RUSSIAN", "Русский");
        data.put("MENU_SETTINGS_LANGUAGE_ENGLISH", "Английский");

        data.put("MENU_HELP_ABOUT", "О программе");
    }
}
