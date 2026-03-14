# Java 程式設計(一) 作業儲存庫

## 課程資訊
- 課程名稱：Java程式設計(一)
- 作業內容：Assignment 1-1 + 1-2 + 1-3 + 1-4
- 主題：使用 VS Code + AI 協作開發非線性/線性數學模型程式

## 摘要
本研究以 Java 程式設計(一)課程作業為案例，探討結合 VS Code 與生成式 AI 之協作式程式開發流程。研究方法涵蓋專案環境建置、線性與非線性數學模型建模、Euler 法數值模擬程式實作，以及執行結果之系統化文件整理。研究結果顯示，透過 AI 協作可提升開發流程之完整性與文件產出效率，並有助於強化模型實作與程式驗證之學習成效。

專案儲存庫網址：
- https://github.com/Eason0101-a/java_Assignment-1-2026-3-3

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
- steps: 15
- r: 0.5
- K: 100

## Logistic 模型測試說明
編譯並執行 Java 程式後，我們測試了非線性 Logistic 模型的表現。
本次設定為 $x(0)=10$、$dt=0.1$、$r=0.5$ 與 $K=100$。
終端機輸出結果與狀態變化如圖 \ref{fig:terminal} 所示。
