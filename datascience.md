## **1. Introduction to Data Science**

* **Definition**: Data Science is the practice of collecting, processing, analyzing, and interpreting data to extract useful insights. It merges **statistics, computer science, mathematics, and domain knowledge**.
* **Pipeline of Data Science**:

  1. **Problem Formulation** → Define business/research problem.
  2. **Data Collection** → Surveys, APIs, databases, sensors.
  3. **Data Preprocessing** → Cleaning, integration, reduction.
  4. **Exploratory Data Analysis (EDA)** → Summaries, visualizations.
  5. **Modeling** → Machine Learning/AI/statistics.
  6. **Evaluation** → Performance testing, metrics.
  7. **Deployment & Monitoring** → Real-world application.
* **Applications**:

  * Healthcare (disease prediction, drug discovery)
  * Finance (fraud detection, algorithmic trading)
  * Retail (recommendation engines, demand forecasting)
  * Social Media (sentiment analysis, personalization)

---

## **2. Big Data and Data Science**

* **Big Data**: Extremely large and complex datasets that cannot be handled by traditional tools.
* **5 Vs of Big Data**:

  * **Volume**: Scale of data (TBs, PBs). Example: Facebook generates \~4PB per day.
  * **Velocity**: Speed at which data is generated (IoT sensors, stock trading).
  * **Variety**: Structured (databases), semi-structured (XML, JSON), unstructured (text, video).
  * **Veracity**: Reliability of data (inconsistent, noisy).
  * **Value**: Extracting actionable insights.
* **Data Science + Big Data**:

  * Big Data = raw resource.
  * Data Science = set of techniques (ML, stats, visualization) to derive value from Big Data.

---

## **3. Introduction to Big Data Platforms**

* **Need**: Traditional systems fail with large, fast, diverse data.
* **Key Platforms**:

  * **Hadoop Ecosystem**:

    * **HDFS (Hadoop Distributed File System)**: Stores massive datasets in a distributed way.
    * **MapReduce**: Parallel data processing framework.
    * **Hive**: SQL-like queries for Hadoop.
    * **Pig**: High-level language for data processing.
  * **Apache Spark**: In-memory data processing, faster than Hadoop, supports ML & streaming.
  * **Cloud Platforms**:

    * **AWS EMR**: Hadoop/Spark on cloud.
    * **Azure Data Lake**: Scalable storage + analytics.
    * **Google BigQuery**: Serverless, real-time analytics.

---

## **4. Challenges of Conventional Systems**

* **Scalability Issue**: RDBMS struggles with petabytes of data.
* **Limited Speed**: Sequential reads/writes are slow for streaming data.
* **Data Variety**: SQL DBs store structured data only.
* **Storage Cost**: High when scaling traditional databases.
* **Fault Tolerance**: Failures lead to system crashes.
* **Example**: Banking systems shifting from traditional DBs to Hadoop for fraud detection.

---

## **5. Nature of Data**

* **Structured Data**: Tables, relational DBs. Example: Customer transactions.
* **Semi-structured Data**: JSON, XML. Example: Web logs.
* **Unstructured Data**: Audio, video, text. Example: Social media posts.
* **Temporal Data**: Time-series (stock prices).
* **Spatial Data**: Geographic (maps, GPS).
* **Streaming Data**: Real-time from IoT devices, transactions.

---

## **6. Analytic Processes and Tools**

* **Steps**:

  1. Data Acquisition (APIs, scraping, DBs)
  2. Data Preprocessing (cleaning, transformation)
  3. EDA (graphs, statistics)
  4. Modeling (ML algorithms, regression, classification)
  5. Validation (cross-validation, test sets)
  6. Deployment (dashboards, apps)
* **Tools**:

  * **Programming**: Python, R, SQL
  * **Big Data**: Spark, Hadoop
  * **Visualization**: Tableau, Power BI, Matplotlib, Seaborn
  * **Cloud**: AWS, GCP, Azure

---

## **7. Analysis vs Reporting**

* **Analysis**:

  * Goal → Discover insights, predict future.
  * Methods → Machine learning, statistics, hypothesis testing.
  * Example → Predict customer churn using ML.
* **Reporting**:

  * Goal → Present past & present information.
  * Methods → Dashboards, summaries.
  * Example → Monthly sales report in Power BI.

---

## **8. Modern Data Analytic Tools**

* **Power BI (Microsoft)**: Business dashboards, DAX queries, integrates with Excel.
* **Tableau**: Drag-and-drop interface, advanced storytelling, good for interactive dashboards.
* **Google Data Studio**: Free, integrates with Google Analytics.
* **QlikView/QlikSense**: Associative data model for fast analysis.

---

## **9. Multi-Dimensional Data (OLAP)**

* **Concept**: Data represented as a cube with dimensions.
* Example: Sales Data → {Region, Time, Product}.
* **Operations**:

  * **Slice**: Select single dimension (sales in 2023).
  * **Dice**: Select subset (sales in 2023, Asia region).
  * **Roll-up**: Summarize (City → Country).
  * **Drill-down**: More detail (Year → Month → Day).

---

## **10. Exploratory Data Analysis (EDA)**

* **Purpose**: Summarize dataset, detect patterns, verify assumptions.
* **Basic Tools**:

  * **Plots**: Histogram (distribution), Scatter (relationships), Boxplot (outliers).
  * **Graphs**: Line graphs (trends), Bar charts (comparisons).
  * **Summary Stats**: Mean, median, variance, correlation.
* **Example**: Detect skewed data distribution before applying ML.

---

## **11. Preprocessing the Data**

* **Why?** Raw data is incomplete, noisy, inconsistent.
* **Steps**:

  * Data cleaning (remove missing/outliers)
  * Integration (combine sources)
  * Transformation (normalize, encode)
  * Reduction (compress, sample)

---

## **12. Data Cleaning**

* **Missing Data**:

  * Remove tuples
  * Fill with mean/median/mode
  * Predict values (regression, kNN)
* **Outliers**:

  * Z-score method
  * IQR method
* **Inconsistencies**:

  * Standardize units (kg vs lbs)
  * Resolve duplicates

---

## **13. Data Integration & Transformation**

* **Integration**: Merge data from multiple sources (DBs, CSVs, APIs).
* **Transformation**:

  * Normalization (scaling features)
  * Encoding categorical data (One-hot, label encoding)
  * Aggregation (monthly sales from daily sales)
  * Feature Engineering (creating new variables like BMI = weight/height²).

---

## **14. Data Reduction**

* **Purpose**: Reduce size but keep essential info.
* **Techniques**:

  * **Dimensionality Reduction**: PCA, LDA.
  * **Numerosity Reduction**: Sampling, clustering.
  * **Compression**: JPEG compression for images.

---

## **15. Discretization & Concept Hierarchy**

* **Discretization**: Convert continuous → categorical.

  * Example: Age → {0–12=Child, 13–19=Teen, 20–59=Adult, 60+=Senior}.
* **Concept Hierarchy**: Levels of abstraction.

  * Example: City → State → Country → Continent.

---

## **16. Data Summarization**

* **Statistical Summaries**: Min, Max, Mean, Quartiles.
* **Group Summaries**: Pivot tables, OLAP cubes.
* **Frequency Distribution**: Number of occurrences of values.
* **Example**: Sales summary by region and product category.

---

## **17. Data Normalization**

* **Goal**: Standardize attributes for comparability.
* **Methods**:

  * **Min-Max Scaling**:
    $x' = \frac{x - min(x)}{max(x) - min(x)}$ → \[0,1] range.
  * **Z-Score Normalization**:
    $z = \frac{x - \mu}{\sigma}$ → mean=0, std=1.
  * **Decimal Scaling**: Move decimal points. Example: 987 → 0.987.
* **Importance**: Prevents bias in ML algorithms (e.g., KNN, SVM).

---


# 📘 Module II Notes: Advanced Data Science Concepts

---

## **1. Computer Vision**

* **Definition**: Computer Vision (CV) is a field of AI that enables machines to interpret and understand visual data (images, videos).
* **Pipeline**:

  1. **Image Acquisition** → camera, sensors, datasets.
  2. **Preprocessing** → resizing, noise removal, normalization.
  3. **Feature Extraction** → edges, textures, shapes, colors.
  4. **Modeling** → ML/DL models (CNN, ResNet, YOLO).
  5. **Decision/Output** → classification, detection, segmentation.
* **Key Tasks**:

  * Image Classification (cat vs dog).
  * Object Detection (self-driving cars).
  * Image Segmentation (medical imaging).
  * Facial Recognition.
* **Techniques**:

  * **Traditional**: SIFT, HOG, Haar features.
  * **Deep Learning**: Convolutional Neural Networks (CNNs).

---

## **2. Time Series Analysis and Forecasting**

* **Definition**: A **time series** is a sequence of data points collected over time (daily stock price, hourly temperature).
* **Components**:

  * **Trend**: Long-term direction (upward sales over years).
  * **Seasonality**: Regular cycles (festive sales).
  * **Cyclic Patterns**: Long-term irregular patterns (economic cycles).
  * **Noise**: Random variation.
* **Analysis Methods**:

  * **Descriptive**: Moving averages, smoothing.
  * **Stationarity Testing**: ADF test, KPSS test.
  * **Autocorrelation**: Identify repeating patterns.
* **Forecasting Methods**:

  * **Statistical Models**:

    * ARIMA (AutoRegressive Integrated Moving Average).
    * SARIMA (seasonal ARIMA).
    * Exponential Smoothing (Holt-Winters).
  * **Machine Learning**:

    * LSTMs (Long Short-Term Memory networks).
    * Prophet (Facebook’s library).
* **Applications**: Stock market, weather forecasting, demand prediction.

---

## **3. Streaming Data**

* **Definition**: Continuous flow of real-time data generated from sources like IoT, sensors, financial transactions, and social media.
* **Characteristics**:

  * High Velocity.
  * Large Volume.
  * Real-time Processing Needed.
* **Tools for Processing**:

  * **Apache Kafka** → real-time data pipelines.
  * **Apache Spark Streaming** → micro-batch stream processing.
  * **Apache Flink / Storm** → low-latency, event-driven processing.
* **Applications**:

  * Fraud detection in banking.
  * Real-time recommendation (Netflix, YouTube).
  * IoT (smart homes, connected vehicles).

---

## **4. Statistical Inference**

* **Definition**: Drawing conclusions about a **population** from a **sample** using probability and statistics.
* **Key Concepts**:

  * **Population**: Entire set (all students in a university).
  * **Sample**: Subset of population (200 randomly chosen students).
  * **Parameter**: True but unknown measure of population (mean, variance).
  * **Statistic**: Measure calculated from a sample.
* **Sampling Methods**:

  * Simple Random Sampling.
  * Stratified Sampling.
  * Cluster Sampling.

---

## **5. Statistical Modeling**

* **Definition**: Representing data relationships mathematically to make predictions.
* **Types**:

  * **Deterministic Models**: Always same output (physics equations).
  * **Probabilistic Models**: Incorporate randomness (logistic regression, Bayesian models).
* **Process**:

  * Choose model (linear, regression, etc.).
  * Fit parameters using sample data.
  * Test for accuracy (R², RMSE).

---

## **6. Probability Distributions**

* **Definition**: Functions that describe how probabilities are distributed over possible values.
* **Discrete Distributions**:

  * **Binomial**: Success/failure outcomes.
  * **Poisson**: Events over time/space (calls per minute).
* **Continuous Distributions**:

  * **Normal (Gaussian)**: Bell-shaped, common in natural data.
  * **Exponential**: Time between events.
  * **Uniform**: Equal probability for all outcomes.
* **Applications**:

  * Binomial → Predicting election wins.
  * Normal → Heights, IQ scores.
  * Poisson → Number of emails received per hour.

---

## **7. Fitting a Model**

* **Definition**: Estimating the parameters of a statistical or machine learning model so that it explains/predicts data well.
* **Steps**:

  1. Choose model form (linear regression, logistic regression, etc.).
  2. Estimate parameters (Maximum Likelihood, Least Squares).
  3. Evaluate fit (R², RMSE, AIC, BIC).
* **Overfitting vs Underfitting**:

  * Overfitting → Model fits noise (high variance).
  * Underfitting → Model too simple (high bias).
* **Regularization**:

  * L1 (Lasso), L2 (Ridge), Elastic Net.

---

## **8. Feature Generation (Role of Domain Expertise)**

* **Feature Generation**: Creating new features from raw data to improve model performance.
* **Role of Domain Expertise**:

  * Domain experts help create **meaningful variables** that reflect real-world knowledge.
  * Example: In healthcare, BMI (weight/height²) is more informative than raw weight.
* **Examples**:

  * Finance → Debt-to-Income ratio.
  * Retail → Recency-Frequency-Monetary (RFM) features.
  * Text Data → TF-IDF, word embeddings.

---

## **9. Feature Selection Algorithms**

* **Definition**: Choosing the most relevant subset of features to improve model accuracy and reduce complexity.
* **Benefits**:

  * Reduces overfitting.
  * Improves interpretability.
  * Decreases computation time.
* **Methods**:

  1. **Filter Methods** (independent of ML model):

     * Correlation coefficient, Chi-square test, ANOVA.
     * Information Gain, Mutual Information.
  2. **Wrapper Methods** (use ML model performance):

     * Recursive Feature Elimination (RFE).
     * Forward/Backward Selection.
  3. **Embedded Methods**:

     * Lasso (L1 regularization → shrinks irrelevant features to 0).
     * Decision Trees/Random Forest (feature importance scores).
     * Gradient Boosting feature importance.
* **Example**: In spam detection, “presence of suspicious links” is more important than “email length.”

---

# 📘 Module III Notes: Data Preprocessing & Data Mining Techniques

---

## **1. Data Preprocessing**

* **Definition**: Preparing raw data into a suitable form for mining and modeling.
* **Why?** Raw data often has **noise, missing values, inconsistencies**.
* **Steps**:

  * **Data Cleaning**: Handle missing values (mean/median, imputation), remove duplicates, correct errors.
  * **Data Integration**: Merge data from multiple sources.
  * **Data Transformation**: Normalize, standardize, aggregate, encode categorical variables.
  * **Data Reduction**: Dimensionality reduction (PCA), sampling, discretization.
  * **Data Discretization**: Convert continuous → categorical bins.

---

## **2. Data Mining Techniques**

Data Mining = Extracting useful patterns, relationships, and knowledge from large datasets.

### **2.1 Statistical Techniques**

* Use probability & statistical models to identify trends.
* Examples:

  * Regression (predict continuous values).
  * Hypothesis testing.
  * Correlation analysis.

---

### **2.2 Characterization and Discrimination**

* **Characterization**: Summarizing general features of a class of data.

  * Example: Average income of all customers.
* **Discrimination**: Comparing features of different classes.

  * Example: Compare income levels of “loyal customers” vs “one-time buyers.”

---

### **2.3 Association and Market Basket Analysis**

* **Definition**: Discover relationships between items in large datasets.
* **Example**: “Customers who buy bread often also buy butter.”
* **Measures**:

  * **Support**: Frequency of itemset in database.
  * **Confidence**: Likelihood of B given A.
  * **Lift**: Strength of association relative to chance.

---

### **2.4 Classification and Prediction**

* **Classification**: Predict categorical labels (spam vs not spam).
* **Prediction**: Forecast continuous values (predict stock price).
* **Steps**:

  1. Training (build model on labeled data).
  2. Testing (evaluate model on unseen data).

---

### **2.5 Decision Trees**

* **Definition**: Tree-like model where nodes = attributes, branches = conditions, leaves = class labels.
* **Algorithms**: ID3, C4.5, CART.
* **Advantages**: Easy to interpret, handles categorical + numerical data.
* **Example**: Predict loan approval (based on income, credit score, age).

---

### **2.6 Neural Networks**

* **Definition**: Computational models inspired by human brain, used for complex classification & prediction.
* **Components**:

  * Input Layer → features.
  * Hidden Layers → transformations.
  * Output Layer → prediction.
* **Types**:

  * Feed-forward, CNN (images), RNN (sequences).
* **Strength**: Learns nonlinear relationships.

---

### **2.7 Bayesian Classification**

* **Definition**: Probabilistic classifier based on Bayes’ theorem.
* **Formula**:
  $P(H|E) = \frac{P(E|H)P(H)}{P(E)}$
* **Types**:

  * Naïve Bayes (assumes independence between features).
* **Example**: Spam filtering (probability email = spam given words).

---

### **2.8 Association Rules**

* **Definition**: If-then rules to describe relationships between items.
* **Example**: IF {Milk, Bread} → THEN {Butter}.
* **Metrics**: Support, Confidence, Lift (as in market basket analysis).

---

### **2.9 Apriori Algorithm**

* **Purpose**: Find frequent itemsets in large datasets.
* **Process**:

  1. Start with single items, calculate support.
  2. Generate larger itemsets iteratively.
  3. Prune non-frequent sets.
* **Drawback**: Slow for very large datasets.

---

### **2.10 FP-Growth (Frequent Pattern Tree)**

* **Improved alternative to Apriori**.
* Builds a compressed **FP-tree** of transactions.
* Extracts frequent itemsets directly without candidate generation.
* **Advantage**: Much faster for large datasets.

---

## **3. Introduction to Genetic Algorithm (GA)**

* **Definition**: Optimization algorithm inspired by natural selection & genetics.
* **Key Steps**:

  1. **Initialization**: Generate population of candidate solutions.
  2. **Selection**: Choose best candidates based on fitness.
  3. **Crossover**: Combine solutions to form new offspring.
  4. **Mutation**: Random changes to maintain diversity.
  5. **Termination**: Stop when solution converges.
* **Applications**:

  * Feature selection, scheduling, optimization problems.

---

## **4. Cluster Analysis**

* **Definition**: Grouping data into clusters such that items in the same cluster are more similar to each other than to others.
* **Techniques**:

  * **Partitioning**: k-means, k-medoids.
  * **Hierarchical**: Agglomerative (bottom-up), Divisive (top-down).
  * **Density-based**: DBSCAN, OPTICS.
* **Applications**: Customer segmentation, image compression, anomaly detection.

---

## **5. Automatic Cluster Detection**

* **Challenge**: Deciding the optimal number of clusters.
* **Methods**:

  * **Elbow Method**: Plot cost vs k, look for “elbow.”
  * **Silhouette Score**: Measures cohesion vs separation.
  * **Gap Statistic**: Compares clustering with random data.

---

## **6. Outlier Analysis**

* **Definition**: Identifying rare data points that differ significantly from the rest.
* **Types of Outliers**:

  * **Global**: Far from all other data points.
  * **Contextual**: Abnormal in specific context (e.g., temperature 30°C normal in summer, abnormal in winter).
  * **Collective**: Group of points unusual together.
* **Detection Methods**:

  * Statistical (Z-score, IQR).
  * Distance-based (kNN outlier detection).
  * Density-based (LOF – Local Outlier Factor).
* **Applications**:

  * Fraud detection in finance.
  * Network intrusion detection.
  * Healthcare anomaly detection.

---
