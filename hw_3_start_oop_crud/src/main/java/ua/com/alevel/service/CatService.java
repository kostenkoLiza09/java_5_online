package ua.com.alevel.service;
import ua.com.alevel.entity.BaseEntity;
import ua.com.alevel.entity.Cat;


import java.util.ArrayList;
import java.util.UUID;

public class CatService extends BaseEntity {

    private ArrayList <Cat> cats = new ArrayList<Cat>(); //добавляем коллекцию и храним объкты Сat
    public void create(Cat cat) {
        cat.setId(generateId());
        cats.add(cat); //добавляем котов

    }
    public void update(Cat cat) {
        for(int i = 0; i < cats.size(); i++) { //добавляем цикл
            if (cats.get(i).getId().equals(cat.getId())) { //если котячий id совпадает с id обновленным котом
                cats.set(i, cat); //заменяем тут на обновленного
            }
        }
    }



    public Cat delete(String id) {
        for(int i = 0; i < cats.size(); i++) {  // по циклу перебераем котячие id
            if (cats.get(i).getId().equals(id)) { // проводим проверку совпадает id
                Cat cat = cats.get(i);// сохраняем удаляемого кота
                cats.remove(i); // удадаляем кота из масива
                return cat;
            }
        }
        return null; // выводим null если не нашли кота с id
    }


    public Cat findById(String id) {
        for (Cat cat : cats) {
            if(cat.getId().equals(id)){
                return  cat;
            }

        }
        return null;
    }

    public ArrayList<Cat> findAll(){
        return cats;
    }
    private String generateId(){
        String id = UUID.randomUUID().toString();
        for (Cat cat : cats) {
            if (cat != null && cat.getId().equals(id)) {
                return generateId();

            }

        }
        return id;
    }
}
