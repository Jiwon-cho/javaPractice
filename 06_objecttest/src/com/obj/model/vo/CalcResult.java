package com.obj.model.vo;

//데이터 저장용 클래스
public class CalcResult {
	public int su;
	public int su2;
	public char op;
	public double result;
//	
	public CalcResult() {}
	
	public CalcResult(int su,int su2,char op,double result) {
		this.su=su;
		this.su2=su2;
		this.op=op;
		this.result=result;
	}
	
}
