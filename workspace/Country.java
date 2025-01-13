public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String image;
  // add constructors
  public Country(){
    name = "";
    capital = "";
    language = "";
    image = "";
  }
  public Country(String initName, String initCapital, String initLanguage, String initImage){
    name = initName;
    capital = initCapital;
    language = initLanguage;
    image = initImage;
  }
  // Write accessor/get methods for each instance variable that returns it.
  public String getName(){
    return name;
  }
  public String getCapital(){
    return capital;
  }
  public String getLanguage(){
    return language;
  }
  public String getImage(){
    return image;
  }
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
  public String toString(){
    return name + "'s capital is " + capital + " and its primary language is " + language;
  }


  
}