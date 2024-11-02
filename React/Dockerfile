# React用Dockerfile
FROM node:16

WORKDIR /app

# パッケージのインストール
COPY package*.json ./
RUN npm install

# ソースコードのコピー
COPY . .

# 開発サーバーの起動
CMD ["npm", "start"]