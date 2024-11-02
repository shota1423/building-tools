
# ベースイメージ
FROM maven:3-openjdk-11

# 作業ディレクトリを指定
WORKDIR /app

# Mavenプロジェクトのpom.xmlをコピー
COPY pom.xml .

# Maven依存関係をダウンロード（ここでmvn clean installを実行すると依存関係がダウンロードされます）
RUN mvn verify clean --fail-never

# ソースコードをコピー
COPY src ./src

# アプリケーションをビルド
RUN mvn package

# アプリケーションの実行
CMD ["java", "-jar", "target/app.jar"]
