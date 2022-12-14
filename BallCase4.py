# Import required library
from sklearn import tree

# Load the dataset
# Rough 1
# Smooth 0

# Tennis 1
# Cricket 2

def BallPredictor(weight, surface):
    Features = [[35,1],[47,1],[90,0],[48,1],[90,0],[35,1],[92,0],[35,1],[35,1],[35,1],[96,0],[43,1],[110,0],[35,1],[95,0]]
    Labels = [1,1,2,1,2,1,2,1,1,1,2,1,2,1,2]

    # Decide the Machine Learning Algorithm
    obj = tree.DecisionTreeClassifier()

    # Perform the training of model
    obj = obj.fit(Features, Labels)

    # Perform the testing
    ret=(obj.predict([[weight,surface]]))
    if ret==1:
        print("your object look like tennis ball")
    else:
        print("your object look like a cricket ball")
def main():
    print("----------- Ball Predictor Case Study -----------")
    print("enter the weight of your object in grams")
    weight=int(input())

    print("enter the type surface your object(Rough/smooth)")
    surface=input()
    if surface.lower()=="rough":
        surface=1
    elif surface.lower()=="Smooth":
        surface=0
    else:
        print("invalid type of surface")
        exit()        
    BallPredictor(weight,surface)

if __name__ == "__main__":
    main()