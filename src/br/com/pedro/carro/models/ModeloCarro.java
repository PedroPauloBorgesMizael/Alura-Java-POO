package br.com.pedro.carro.models;

public class ModeloCarro extends Carro {
  public ModeloCarro(String model, int firstYear, double year1, double year2, double year3) {
    setModel(model);
    setFirstYear(firstYear);
    setPrices(year1, year2, year3);
  }
}
