package br.com.pedro.carro;

public class Carro {
  private String model;
  private double[] prices = new double[3];

  public void setModel (String model) {
    this.model = model;
  }
  public void setPrices (double price1, double price2, double price3) {
    prices[0] = price1;
    prices[1] = price2;
    prices[2] = price3;
  }

  public double getLowerPrice() {
    double lower = prices[0];
    for (double price : prices) {
      if (price < lower) {
        lower = price;
      }
    }
    return lower;
  }

  public double getBiggestPrice() {
    double biggest = prices[0];
    for (double price : prices) {
      if (price > biggest) {
        biggest = price;
      }
    }
    return biggest;
  }

  public void showData() {
    System.out.println("Modelo: " + model);
    for (int i = 0; i < prices.length; i++) {
      System.out.println("Preço ano " + (i + 1) + ": R$ " + prices[i]);
    }
    System.out.println("Menor preço: R$ " + getLowerPrice());
    System.out.println("Maior preço: R$ " + getBiggestPrice());
  }
}
