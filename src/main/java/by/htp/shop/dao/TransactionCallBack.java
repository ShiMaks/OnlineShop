package by.htp.shop.dao;

import org.hibernate.Session;

/**
 *
 */
public interface TransactionCallBack {

    void doInTransaction(Session session);
}
