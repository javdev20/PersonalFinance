package model;

abstract public class Common {

    public Common() {}

    //вернуть строку для выпадающего списка
    public String getValueForComboBox() {
        return null;
    }

    // hook for editing
    public void postAdd() {}
    public void postEdit() {}
    public void postRemove() {}
}
