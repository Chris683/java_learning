package customerinformationmanagement.service;

import customerinformationmanagement.bean.Customer;

/**
 * @author Chris
 * @create 2021-07-02-14:39
 */
// CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，
// 供CustomerView调用

public class CustomerList {
    public Customer[] customers;               // 用来保存客户对象的数组
    private int total = 0;                     // 记录已保存客户对象的数量

    // 初始化customers数组的构造器，totalCustomer：指定数组的长度
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    // 将指定的客户添加到数组中，true:添加成功  false:添加失败
    public boolean addCustomer(Customer customer){
        if (total>=customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    // 修改指定索引位置的客户信息，true:修改成功   false：修改失败
    public boolean replaceCustomer(int index, Customer cust){
        if (index<0 || index>=total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    // 删除指定索引位置上的客户,true:删除成功   false:删除失败
    public boolean deleteCustomer(int index){
        if (index<0 || index>=total){
            return false;
        }
        for (int i=index;i<total-1;i++) {
            customers[i] = customers[i+1];
        }

        // 最后有数据的元素需要置空
        customers[total-1] = null;
        total--;
        return true;
    }

    // 获取所有客户的信息
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0;i<total;i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    // 获取指定索引位置上的客户，如果找到了元素则返回，如果没有找到，则返回null
    public Customer getCustomer(int index){
        if (index<0 || index>= total){
            return null;
        }
        return customers[index];
    }

    // 获取存储的客户的数量
    public int getTotal(){
        return total;
    }
}

