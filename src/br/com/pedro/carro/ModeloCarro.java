package br.com.pedro.carro;

public class ModeloCarro extends Carro{
  public ModeloCarro(String model, double year1, double year2, double year3) {
    setModel(model);
    setPrices(year1, year2, year3);
  }
}
