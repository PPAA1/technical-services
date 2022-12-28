from sklearn.datasets import load_iris
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score
from sklearn.model_selection import train_test_split
from scipy.spatial import distance
def euc(a,b):
    return distance.edclideian(a,b)
class MarvellousKNeighborsClassifier:
    
  def fit(self,trainigdata, trainigtarget):
      self.TrainingData=TrainingData
      self.Training=trainingtarget

      def closest(self,row):
        minimumdistance=euc(row,self.Trainingdata[0])
        minimumdindex=0

        for i in range(1,len(self.TrainingData)):
            Distance=euc(row, self.TrainingData[i])
            if Distance < minimumdistance:
                minimumdistance=Distance
                minimumindex=i
            return self.TrainingData[minimumindex]

        def predict(self, TestData):
            predictions=[]
            for value in TestData:
                result=self.closest(value)
                predictions.append(result)
            return predictions         

def MarvellousML():
    Dataset = load_iris()       # 1 Load the data

    Data = Dataset.data
    Target = Dataset.target

    Data_train, Data_test, Target_train, Target_test = train_test_split(Data, Target, test_size = 0.5)

    Classifier = DecisionTreeClassifier()

    Classifier.fit(Data_train, Target_train)

    Predictions = Classifier.predict(Data_test)

    Accuracy = accuracy_score(Target_test, Predictions)

    return Accuracy

def main():
    Ret = MarvellousKNeighborsClassifier

    print("Acuracy of Iris dataset with KNN is ",Ret * 100)

if __name__ == "__main__":
    main()