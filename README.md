# WaterMelon
## 프로젝트 설명
* 화면 구성 : 검색창과 그 결과를 보여주는 책 리스트 탭과 선호 책 리스트 탭으로 구성 
* 선호 책 리스트는 room을 사용하여 로컬 디비에 저장 (결과 리스트, 선호 리스트, 리스트 상세에서 선호 스위치 버튼을 통해 적용가능)
* 선호 리스트 정렬 가능 
* 책 리스트 아이템 선택시 상세화면으로 이동 
* 상세 화면에서 저자 선택시 저자 발간 책 리스트 보여줌 
* 카카오 책 검색 api를 이용하여 검색 결과에 맞는 책리스트 불러옴
* MVVM (Kotlin + datading + liveData)

## MVVM 구성 
1. Model : 네트워크 통신을 통해 bookSearchApi를 요청해 데이터를 가져옴 
2. View : Activity, Fragment
3. ViewModel 

## 사용 라이브러리 
1. Retrfit2
2. koin 
3. Glide
5. RxJava2
6. RecyclerView 
7. room
8. paging
9. Material
10. navigation
