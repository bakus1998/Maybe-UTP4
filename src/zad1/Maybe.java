package zad1;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Maybe<T> {
    public T t;

    public Maybe(T t){
        this.t=t;
    }

    public static <T> Maybe <T> of(T t){
        return new Maybe<>(t);
    }

    public void ifPresent(Consumer<T> cons){
        boolean stat = isPresent();

        if(stat==true){
            cons.accept(t);
        }

    }

    private Maybe(){
    }

    public <S> Maybe <S> map(Function<T,S> func){
        if(isPresent()){
            S s = func.apply(t);
            return new Maybe<>(s);
        }else{
            return new Maybe<>();
        }
    }


    public T get() {
        if(isPresent()==true){
            return t;
        }else {
            throw new NoSuchElementException("maybe is empty");
        }
    }



    public boolean isPresent(){
        if(t!=null){
            return true;
        }else{
            return false;
        }
    }

    public T orElse (T defVal) {
        if(isPresent()==false){
            return defVal;
        }else{
            return t;
        }

    }


    public Maybe<T> filter(Predicate<T> pred) {

        if (pred.test(t)&&isPresent()) {
            return this;
        } else {
            return new Maybe<>();
        }
    }



    @Override
    public String toString() {
        if(isPresent()){
            return "Maybe has value " + t;
        }else{
            return "Maybe is empty";
        }
    }
}
