
package com.mycompany.one.to.many;


public class dep extends dept {

    public dep() {
    }

    public dep(int dptNum, String deptName) {
        super(dptNum, deptName);
    }

    @Override
    public void setDeptName(String deptName) {
        while (deptName.isBlank()) {            
            System.out.println("dept name must be entered");
            deptName=in.next();
        }
        
        this.deptName = deptName;
        

    }
    
}
