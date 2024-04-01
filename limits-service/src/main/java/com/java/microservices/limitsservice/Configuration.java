package com.java.microservices.limitsservice;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("limits-service")
public class Configuration 
{
private int maximum;
private int minimum;
private String booknames;
private String bookprices;

public String getBooknames() {
	return booknames;
}
public void setBooknames(String booknames) {
	this.booknames = booknames;
}
public String getBookprices() {
	return bookprices;
}
public void setBookprices(String bookprices) {
	this.bookprices = bookprices;
}
public void setMaximum(int maximum) 
{
this.maximum = maximum;
}
public void setMinimum(int minimum) 
{
this.minimum = minimum;
}
public int getMaximum() 
{
return maximum;
}
public int getMinimum() 
{
return minimum;
}
}
