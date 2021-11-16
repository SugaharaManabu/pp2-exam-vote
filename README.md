# pp2-exam-vote

サンプル作ってみました。だいたいこんな感じで良いです

## 企画書

* 教室の空調は、時には暑すぎたり、寒すぎたりします。
* 人によって温度の感じ方は違うので、自分は寒すぎると思っても他の人にはちょうどよかったりします。
* 自分だけ「暑すぎる」「寒すぎる」と思っているのでは？と考えてしまうと、なかなか言い出せません
* そこで、「暑すぎる」「寒すぎる」をNetで投票するソフトウェアを作りました。

## ビルド手順書

### 使用するソフトウェア

* Java11以上
* maven 3.8以上
* git 2.3以上

### gitインストール手順

1. 次のサイトにアクセスします [Git for Windows](https://gitforwindows.org/)
1. downloadボタンを押してインストーラをダウンロードします
1. インストーラを起動してインストールします。
1. Adjusting your PATH environmentではUse Git from the Windows Command Promptを選択することを推奨します。
1. Choosing HTTPS transport backendでは Use the OpenSSL libraryを選択します。
1. ほかはデフォルト設定でOKです。


### ビルド手順

以下の手順でビルドとインストール、実行が同時にてきます。

1. コマンドプロンプトまたはハイパーターミナルを開きます
1. 以下のコマンドを実行し、Gitからプロジェクトをダウンロードします`git clone https://github.com/SugaharaManabu/pp2-exam-vote.git`
1. 以下のコマンドで必要なライブラリのダウンロード、ビルド、実行ができます `mvn spring-boot:run`
1. サーバの停止は`ctrl+c`です。

## インストール手順

ビルド手順に記載

## 使い方

* [http://localhost:8080/counter/vote](http://localhost:8080/counter/vote) を開いて、暑い、または寒いの画像をクリックします
* 押したボタンによって「寒い　に投票ありがとうございました」「暑い　に投票ありがとうございました」と表示されます。
* ボタンを押した数は [http://localhost:8080/counter/show](http://localhost:8080/counter/show) を開くと表示されます
