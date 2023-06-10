package repository.csv;

public interface DataMapper <T, K>{
    T mapToObject(K data);
}
