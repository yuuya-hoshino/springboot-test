FROM postgres:16.1

# JDBCドライバーのコピー
COPY ./postgresql-42.7.1.jar /opt/java/postgresql-42.7.1.jar

# 環境変数の設定
ENV POSTGRES_JDBC_DRIVER_PATH=/opt/java/postgresql-42.7.1.jar