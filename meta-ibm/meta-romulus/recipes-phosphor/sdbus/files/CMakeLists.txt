cmake_minimum_required (VERSION 3.0)
project(sdbus)
set(CMAKE_CXX_STANDARD 20)
set(SRC_LIST main.cpp )

add_executable(sdbus ${SRC_LIST})

target_include_directories(sdbus PUBLIC ${CMAKE_CURRENT_SOURCE_DIR})
find_package(Boost REQUIRED)
include_directories(${BOOST_SRC_DIR})
include_directories(SYSTEM ${CMAKE_BINARY_DIR}/sdbusplus-src/include)
add_definitions(-DBOOST_ERROR_CODE_HEADER_ONLY)
add_definitions(-DBOOST_SYSTEM_NO_DEPRECATED)
add_definitions(-DBOOST_ALL_NO_LIB)
add_definitions(-DBOOST_NO_RTTI)
add_definitions(-DBOOST_NO_TYPEID)
add_definitions(-DBOOST_EXCEPTION_DISABLE)

target_link_libraries(sdbus -lboost_thread -lsystemd sdbusplus -lboost_coroutine )
install(TARGETS sdbus DESTINATION /usr/bin)


