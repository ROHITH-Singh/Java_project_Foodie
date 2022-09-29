package com.entity;

import org.hibernate.Session;

public class Program {

	public static void main(String[] args) {
		Session session = HibernatePersistence.getSessionFactory()
				.openSession();

        session.beginTransaction();
        
       FDRole fdrole1 = new FDRole();
       fdrole1.setRole_id(1);
       fdrole1.setRoleName("Super Admin");
       fdrole1.setOrder_food(false);
       fdrole1.setCustomer_signup(false);
       fdrole1.setRt_admin_signup(false);
       fdrole1.setSearch_rest(true);
       fdrole1.setSearch_menu(true);
       fdrole1.setApprove_rt_admin(true);
       fdrole1.setDa_signup(true);
       fdrole1.setApprove_da(true);
       fdrole1.setRate_da(true);
       fdrole1.setRate_rest(false);
       fdrole1.setAccept_order_deliver(false);
       
       session.save(fdrole1);
       
       FDRole fdrole2 = new FDRole();
       fdrole2.setRole_id(2);
       fdrole2.setRoleName("Super Restaurant Admin");
       fdrole2.setOrder_food(false);
       fdrole2.setCustomer_signup(false);
       fdrole2.setRt_admin_signup(true);
       fdrole2.setSearch_rest(true);
       fdrole2.setSearch_menu(true);
       fdrole2.setApprove_rt_admin(false);
       fdrole2.setDa_signup(false);
       fdrole2.setApprove_da(false);
       fdrole2.setRate_da(false);
       fdrole2.setRate_rest(false);
       fdrole2.setAccept_order_deliver(false);
       
       session.save(fdrole2);
       
       FDRole fdrole3 = new FDRole();
       fdrole3.setRole_id(3);
       fdrole3.setRoleName("FD Delivery Agent");
       fdrole3.setOrder_food(false);
       fdrole3.setCustomer_signup(false);
       fdrole3.setRt_admin_signup(false);
       fdrole3.setSearch_rest(true);
       fdrole3.setSearch_menu(false);
       fdrole3.setApprove_rt_admin(false);
       fdrole3.setDa_signup(true);
       fdrole3.setApprove_da(false);
       fdrole3.setRate_da(false);
       fdrole3.setRate_rest(false);
       fdrole3.setAccept_order_deliver(true);
       
       session.save(fdrole3);
       
       FDRole fdrole4 = new FDRole();
       fdrole4.setRole_id(4);
       fdrole4.setRoleName("FD Customer");
       fdrole4.setOrder_food(true);
       fdrole4.setCustomer_signup(true);
       fdrole4.setRt_admin_signup(false);
       fdrole4.setSearch_rest(true);
       fdrole4.setSearch_menu(true);
       fdrole4.setApprove_rt_admin(false);
       fdrole4.setDa_signup(false);
       fdrole4.setApprove_da(false);
       fdrole4.setRate_da(true);
       fdrole4.setRate_rest(true);
       fdrole4.setAccept_order_deliver(false);
       
        session.save(fdrole4);
        
        FDRole fdrole5 = new FDRole();
        fdrole5.setRole_id(5);
        fdrole5.setRoleName("FD Restaurants");
        fdrole5.setOrder_food(false);
        fdrole5.setCustomer_signup(false);
        fdrole5.setRt_admin_signup(false);
        fdrole5.setSearch_rest(true);
        fdrole5.setSearch_menu(true);
        fdrole5.setApprove_rt_admin(false);
        fdrole5.setDa_signup(false);
        fdrole5.setApprove_da(false);
        fdrole5.setRate_da(false);
        fdrole5.setRate_rest(false);
        fdrole5.setAccept_order_deliver(false);
        
        session.save(fdrole5);
        
        FDRole fdrole6 = new FDRole();
        fdrole6.setRole_id(6);
        fdrole6.setRoleName("FD RT Pending");
        fdrole6.setOrder_food(false);
        fdrole6.setCustomer_signup(false);
        fdrole6.setRt_admin_signup(false);
        fdrole6.setSearch_rest(false);
        fdrole6.setSearch_menu(false);
        fdrole6.setApprove_rt_admin(false);
        fdrole6.setDa_signup(false);
        fdrole6.setApprove_da(false);
        fdrole6.setRate_da(false);
        fdrole6.setRate_rest(false);
        fdrole6.setAccept_order_deliver(false);
        session.save(fdrole6);
        
        FDRole fdrole7 = new FDRole();
        fdrole7.setRole_id(7);
        fdrole7.setRoleName("FD DA Pending");
        fdrole7.setOrder_food(false);
        fdrole7.setCustomer_signup(false);
        fdrole7.setRt_admin_signup(false);
        fdrole7.setSearch_rest(false);
        fdrole7.setSearch_menu(false);
        fdrole7.setApprove_rt_admin(false);
        fdrole7.setDa_signup(false);
        fdrole7.setApprove_da(false);
        fdrole7.setRate_da(false);
        fdrole7.setRate_rest(false);
        fdrole7.setAccept_order_deliver(false);
        session.save(fdrole7);
        
 
        session.getTransaction().commit();
        session.close();
        
        HibernatePersistence.getSessionFactory().close();
        
        System.out.println("karthik");

	}

}
