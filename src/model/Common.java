package model;

abstract public class Common {

    //вернуть строку для выпадающего списка
    public String getValutForComboBox() {
        return null;
    }

    // hook for editing
    public void postAdd() {}
    public void postEdit() {}
    public void postRemove() {}
}
