# Dockerfile
FROM php:8.3-fpm

ENV COMPOSER_ALLOW_SUPERUSER 1
ENV COMPOSER_NO_INTERACTION 1

RUN apt-get update && apt-get install -y \
    nginx \
    libzip-dev \
    && docker-php-ext-install zip pdo_mysql

# 作業ディレクトリの設定
WORKDIR /var/www

# Laravelのソースコードをコピー
COPY . .

# Composerをインストール
RUN curl -sS https://getcomposer.org/installer | php -- --install-dir=/usr/bin --filename=composer
RUN composer install

# Nginxの設定ファイルを追加
COPY ./nginx/default.conf /etc/nginx/conf.d/default.conf

# NginxとPHP-FPMを起動
CMD service nginx start && php-fpm
