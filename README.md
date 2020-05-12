# twitter-useful-tools
Twitterの便利機能

## common

1. 「src\main\resources\twitter4j.properties-develop」をコピーして、同じ階層に「src\main\resources\twitter4j.properties」を作成する。
2. 各種パラメータに認証情報を設定する。

## フォローのリツイート通知オフ機能

### 実行方法

1. `src\main\java\retweetoff\Main.java` を実行する。

### 改善点

* プロパティの値を利用しているので開発者アカウントがないと使えない。パスワード認証できるようにしたい。
* 更新時にエラーになるパターンが何件かあった。
* jarして配布できるようにしたい。

