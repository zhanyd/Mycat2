package io.mycat.datasource.jdbc;

import java.io.IOException;

public class MycatUpdateResponseImpl implements MycatUpdateResponse {

  final int updateCount;
  final long lastInsertId;
  final int serverstatus;

  public MycatUpdateResponseImpl(int updateCount, long lastInsertId,int serverstatus) {
    this.updateCount = updateCount;
    this.lastInsertId = lastInsertId;
    this.serverstatus = serverstatus;
  }

  @Override
  public int getUpdateCount() {
    return updateCount;
  }

  @Override
  public long getLastInsertId() {
    return lastInsertId;
  }

  @Override
  public int serverStatus() {
    return serverstatus;
  }

  @Override
  public void close() throws IOException {

  }
}