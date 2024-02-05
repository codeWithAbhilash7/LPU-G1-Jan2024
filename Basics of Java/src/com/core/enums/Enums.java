package com.core.enums;

//enum ORDER_STATUS {

//	PENDING, ACCEPTED, IN_TRANSIT, DELIVERD, CANCELLED, ON_HOLD
//}

//class Order {
//	ORDER_STATUS status;
//}

enum ERROR_CODE {
	BAD_REQUEST(400), UNAUTHORIZED(401), FORBIDDEN(403), PAGE_NOT_FOUND(404);
	
	int errorCode;
	
	ERROR_CODE(int code) {
		errorCode = code;
	}
	
	int getErrorCode() {
		return errorCode;
	}
}

class Page {
	ERROR_CODE code;
}

public class Enums {

	public static void main(String[] args) {
//		Order o1 = new Order();
//		o1.status = ORDER_STATUS.ACCEPTED;
//
//		switch (o1.status) {
//		case PENDING:
//			System.out.println("Status is PENDING");
//			break;
//			
//		case ACCEPTED:
//			System.out.println("Status is ACCEPTED");
//			break;
//			
//		default:
//			break;
//		}
		
		Page p1 = new Page();
		p1.code =  ERROR_CODE.PAGE_NOT_FOUND;
		
		System.out.println("Error message = " + p1.code);
		System.out.println("Error Code = " + p1.code.getErrorCode());
		
		
	}

}
