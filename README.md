# Java 程式設計(一) 作業儲存庫

## 課程資訊
- 課程名稱：Java程式設計(一)
- 作業內容：Assignment 1-1 + 1-2 + 1-3 + 1-4
- 主題：使用 VS Code + AI 協作開發非線性/線性數學模型程式

## 摘要
本儲存庫展示以 AI 輔助進行 Java 程式開發的作業流程，內容包含專案建置、數學模型設計、程式實作與文件整理。

專案儲存庫網址：
- https://github.com/Eason0101-a/java-hw_1

## 關鍵字
- Java
- VS Code
- AI 協作程式開發
- 數學模型
- Euler 方法
- 非線性系統

## 專案結構
```text
.
|-- README.md
|-- src/
|   `-- Main.java
`-- out/               （編譯後產生）
```

## 程式功能（Assignment 1-3 要求）
- 包含數學模型：
  - 線性模型：dx/dt = -k*x
  - 非線性（Logistic）模型：dx/dt = r*x*(1 - x/K)
- 至少包含一個類別：`Main`
- 至少包含一個方法：`simulate()` 與 `computeDerivative()`
- 使用主控台輸入與輸出
- 使用迭代計算（Euler 方法迴圈）

## 編譯與執行
```powershell
javac -d out src/Main.java
java -cp out Main
```

## 範例輸入
- model: 2
- x(0): 10
- dt: 0.1
- steps: 20
- r: 0.5
- K: 100

## Logistic 模型測試說明
編譯並執行 Java 程式後，我們測試了非線性 Logistic 模型的表現。
本次設定為 $x(0)=10$、$dt=0.1$、$r=0.5$ 與 $K=100$。
終端機輸出結果與狀態變化如圖 \ref{fig:terminal} 所示。
