package phones;

import java.text.DecimalFormat;



/**
 * A class to be used in the In-class Exercise 2
 * A SmartPhone has a name and a price.
 * Students my not edit this file unless translating to C#.
 * @author Liz Dancy, 2021.
 * 
 *
 */
public class SmartPhone 
{
 private static final double MAX_VERSION = 4.0;
 private String name; //the name of the phone including brand
 private double price;//the price as a double
 private double version;//the version or release number

 /**
  * The no-arg constructor
  */
 public SmartPhone()
 {
  //intentionally left blank
 }
 
 /**
  * A constructor that lets us set the name, price and version
  * @param givenName the name of the phone
  * @param givenPrice the price as a double
  * @param givenVersion the version to set as a string
  */
 public SmartPhone(String givenName, double givenPrice, double givenVersion)
 {
  name = givenName;
  price = givenPrice;
  version = givenVersion;
 }

 /**
  * A method to format the price as a CAD value
  * @return the price formatted in Canadian dollars
  */
 public String getFormattedPrice()
 {
  return "$" + DecimalFormat.getInstance().format(price);
 }
 /**
  * Accessor for the name field
  * @return the String representing the phone's name
  */
 public String getName() 
 {
  return name;
 }
 
 /**
  * Mutator for the name
  * @param name the name you wish to set
  */
 public void setName(String name) 
 {
  this.name = name;
 }
 
 /**
  * Acessor for the price field
  * @return the price as a double
  */
 public double getPrice() 
 {
  return price;
 }
 /**
  * The String presentation of a phone which is its name, version
  */
 public String toString()
 {
  return name  + ", " + version;
 }

 /**
  * A mutator that sets the Phone's price as a double
  * @param price
  */
 public void setPrice(double price) 
 {
  this.price = price;
 }

 /**
  * Accessor for the version of the phone
  * @return the version of the phone
  */
 public double getVersion() 
 {
  return version;
 }

 /**
  * A mutator that sets the version number for a SmartPhone
  * @param version the version to set for the phone
  * @throws VersionNumberException if the version number is greater than the MAX
  */
 public void setVersion(double version) throws VersionNumberException 
 {
  if (version > MAX_VERSION)
  {
   throw new VersionNumberException(Double.toString(version));
  }
  this.version = version;
 }
 
 

}
