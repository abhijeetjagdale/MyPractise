package com.coe.exceptions.checked;

import java.io.IOException;

public class ExceptionPropagation2 {

		void m() throws IOException {
			throw new java.io.IOException("device error m");// checked exception
		}

		void n() throws IOException {
			m();
		}

		/*void p() {
			try {
				n();
			} catch (Exception e) {
				System.out.println("exception handeled");
			}
		}*/

		public static void main(String args[]) {
			ExceptionPropagation2 obj = new ExceptionPropagation2();
			
			try{
				obj.n();
			}
			catch (Exception e) {
				int a = 50/0;
				// TODO: handle exception
			}
			finally {
				//RuntimeException e = new RuntimeException("Exception from finally");
				System.out.println("Finally");
				//throw e;
			}
		}
}
