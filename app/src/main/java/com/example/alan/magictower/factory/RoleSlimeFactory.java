package com.example.alan.magictower.factory;

import com.example.alan.magictower.info.RolePosition;
import com.example.alan.magictower.role.RoleSlime;
import com.example.alan.magictower.role.RoleType;

/**
 * Function :
 * Modify Date : 2018/1/3
 *
 * @Author : Alan
 * Issue : TODO
 * Whether Solve :
 */

public class RoleSlimeFactory implements IRoleFactory {

    private RoleSlime roleSlime;

    public RoleSlimeFactory(int mId, String mName, String mDes, boolean alive, int mAttack, int mDefense, int life, int x, int y, int mSpeed,RoleType type) {
        roleSlime = new RoleSlime(mId, mName, mDes, alive, mAttack, mDefense, life, x, y, mSpeed,type);

    }

    public RoleSlimeFactory(boolean alive, int mAttack, int mDefense, int life, RolePosition position,RoleType type) {
        roleSlime = new RoleSlime (alive, mAttack, mDefense, life,position,type);

    }

    public void setRoleType(RoleType type) {
        roleSlime.setType(type);
    }

    @Override
    public RoleSlime createRole() {
        return roleSlime;
    }
}
