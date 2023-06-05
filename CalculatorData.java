package com.example.testing_1;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorData {
	CalculatorLogic cl=new CalculatorLogic();
	  @Test(dataProvider="testAddData")
	  public void addMethod(int a,int b,int expected) {
		  int result=cl.add(a,b);
		  Assert.assertEquals(expected, result);
	  }
	  @DataProvider
	  public Object[][]testAddData(){
		  return new Object [][] {
			  {1,2,3}
		  };
	  }
  
  
  @Test(dataProvider="testSubData")
  public void subMethod(int a,int b,int expected) {
	  int result=cl.sub(a,b);
	  Assert.assertEquals(expected, result);
  }
  @DataProvider
  public Object[][]testSubData(){
	  return new Object [][] {
		  {4,3,1}
	  };
  }
  @Test(dataProvider="testMulData")
  public void mulMethod(int a,int b,int expected) {
	  int result=cl.mul(a,b);
	  Assert.assertEquals(expected, result);
  }
  @DataProvider
  public Object[][]testMulData(){
	  return new Object [][] {
		  {2,3,6}
	  };
  }
  @Test(dataProvider="testDivData")
  public void divMethod(int a,int b,int expected) {
	  int result=cl.div(a,b);
	  Assert.assertEquals(expected, result);
  }
  @DataProvider
  public Object[][]testDivData(){
	  return new Object [][] {
		  {2,2,1}
	  };
  }
}
