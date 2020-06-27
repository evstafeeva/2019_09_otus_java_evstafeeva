package ru.otus.bestorm;

/**
 * Всё то же что и с ContainableObjectFactory но действия выполняются в транзации
 */
public interface Transaction {
  /**
   * Получить фабрику 
   * 
   * @param <T> 
   * @return
   */
  public <T> ContainableObjectFactory<T> getFactory();

  /**
   * Выполнить транзакцию
   */
  public void execute();

  /**
   * откатиться к предыдущему состоянию
   */
  public void rollback();
}
