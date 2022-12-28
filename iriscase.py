from sklearn.datasets import load_iris
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import accuracy_score
from sklearn.model_selection import train_test_split                  
def MarvellousKNeighborsClassifier():
    Dataset=load_iris()
    Data=Dataset.data
    Target=Dataset.target
    
    Data_train,Data_test,Target_train,Target_test=train_test_spilt(Data ,Target
    ,text_size=0.5)
    Classifier=KNeighborsClassifier()
    Classifier.fit(Data_train, Target_train)

    predictions=Classifier.predict(Data_test)
    Accuracy=accuracy_score(Target_test, predictions)
    return Accuracy
def main():
    Ret=MarvellousKNeighborsClassifier()
    print("accurayc of iris dataset with KNN",Ret*100)
    

    if __name__=="__main__":
        main()
